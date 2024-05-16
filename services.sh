#!/bin/bash
SLEEP=3

curl -X POST "https://${HOSTIP}/api/Service/upsert" -H "accept: application/json" -H "TOKEN: ${TOKEN}" -H "Content-Type: application/json" -d '{ "className": "twinned.digital.service.base.api.DashboardApi", "basePath": "/analytics"}' && sleep $SLEEP
