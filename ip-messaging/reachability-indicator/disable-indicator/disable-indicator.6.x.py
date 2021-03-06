# Download the Python helper library from twilio.com/docs/python/install
from twilio.rest import Client

# Your Account Sid and Auth Token from twilio.com/console
account = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"
token = "your_auth_token"
client = Client(account, token)

service = client.chat.services("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(
    reachability_enabled=False
)

print(service.reachability_enabled)
