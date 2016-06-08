<?php
// Get the PHP helper library from twilio.com/docs/php/install
require_once('/path/to/twilio-php/Services/Twilio.php'); // Loads the library

// Your Account Sid and Auth Token from twilio.com/user/account
$accountSid = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
$authToken = "{{ auth_token }}";
$workspaceSid = "WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
$workerSid = "{{ worker_sid }}";

$client = new TaskRouter_Services_Twilio($accountSid, $authToken, $workspaceSid);

foreach($client->workspace->workers->get($workerSid)->reservations as $reservation)
{
	echo $reservation->reservation_status;
	echo $reservation->worker_name;
}
