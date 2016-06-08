# Get twilio-ruby from twilio.com/docs/ruby/install
require 'rubygems'          # This line not needed for ruby > 1.8
require 'twilio-ruby'

# Get your Account Sid and Auth Token from twilio.com/user/account
account_sid = 'ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX'
auth_token = '{{ auth_token }}'
workspace_sid = 'WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX'

client = Twilio::REST::TaskRouterClient.new account_sid, auth_token, workspace_sid

client.workspace.workers.list({"Available":"1"}).each do |worker|
  puts worker.friendly_name
end

client.workspace.workers.list({"TaskQueueSid":"WQf855e98ad280d0a0a325628e24ca9627", "Available":"1"}).each do |worker|
  puts worker.friendly_name
end

client.workspace.workers.list({"TargetWorkersExpression":"type == 'leads'"}).each do |worker|
  puts worker.friendly_name
end