// Download the twilio-csharp library from twilio.com/docs/csharp/install
using System;
using Twilio;
class Example 
{
  static void Main(string[] args) 
  {
    // Find your Account Sid and Auth Token at twilio.com/user/account
    string AccountSid = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    string AuthToken = "{{ auth_token }}";
    string WorkspaceSid = "WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    string WorkerSid = "{{ worker_sid }}";
    var client = new TaskRouterClient(AccountSid, AuthToken);

    ReservationResult reservationResult = client.ListReservationsForWorker(WorkspaceSid, WorkerSid)
    foreach(Reservation reservation in reservationResult.Reservations) {
        Console.WriteLine(reservation.ReservationStatus);
        Console.WriteLine(reservation.WorkerName);
    }
  }
}