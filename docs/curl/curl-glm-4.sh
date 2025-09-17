curl -X POST \
        -H "Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsInNpZ25fdHlwZSI6IlNJR04ifQ.eyJhcGlfa2V5IjoiMDU5NTk3OWU4MTkwNDVjMWE1MjYwMDQ2MTdiM2I4NmMiLCJleHAiOjE3NTgxMTI5MTMxNDgsInRpbWVzdGFtcCI6MTc1ODExMTExMzE2MH0.4M2WuF3zAZFOsO6JvrAqquM66xBMau6xZa0nvv64wig" \
        -H "Content-Type: application/json" \
        -H "User-Agent: Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)" \
        -d '{
          "model":"glm-4",
          "stream": "true",
          "messages": [
              {
                  "role": "user",
                  "content": "1+2"
              }
          ]
        }' \
  https://open.bigmodel.cn/api/paas/v4/chat/completions