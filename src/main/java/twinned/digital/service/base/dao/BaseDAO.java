package twinned.digital.service.base.dao;

import javax.ws.rs.core.Response;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import io.boodskap.iot.PlatformException;
import io.boodskap.iot.sql.IgniteResultSetSerializer;

public class BaseDAO {

	public static final ObjectMapper mapper = new ObjectMapper();
	
	static {
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.setSerializationInclusion(Include.NON_NULL);
		//mapper.setSerializationInclusion(Include.NON_EMPTY);
		mapper.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, false);
		mapper.configure(DeserializationFeature.READ_ENUMS_USING_TO_STRING, false);

		SimpleModule module = new SimpleModule();
		module.addSerializer(new IgniteResultSetSerializer());
		
		mapper.registerModule(module);
		
	}
	
	public BaseDAO() {
	}

	public static String toJSON(Object object) {
		try {
			return mapper.writeValueAsString(object);
		} catch (Exception e) {
			throw new PlatformException(e);
		}
	}
	
	public static Response build(Object entity) {
		return Response.ok(BaseDAO.toJSON(entity), "application/json").build();
	}
}
