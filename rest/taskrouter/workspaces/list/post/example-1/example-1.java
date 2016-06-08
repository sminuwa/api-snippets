// Install the Java helper library from twilio.com/docs/java/install
import java.util.HashMap;
import java.util.Map;

import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.TwilioTaskRouterClient;
import com.twilio.sdk.resource.instance.taskrouter.Workspace;

public class Example { 

  // Find your Account Sid and Token at twilio.com/user/account
  private static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  private static final String AUTH_TOKEN = "{{ auth_token }}";
  private static final String WORKSPACE_SID = "WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

  public static void main(String[] args) throws TwilioRestException {
    TwilioTaskRouterClient client = new TwilioTaskRouterClient(ACCOUNT_SID, AUTH_TOKEN);

    Map<String, String> params = new HashMap<String, String>();
    params.put("FriendlyName", "NewWorkspace");
    params.put("EventCallbackUrl", "http://requestb.in/vh9reovh");
    params.put("Template", "FIFO");
    Workspace workspace = client.createWorkspace(params);

    System.out.println(workspace.getFriendlyName());
  }
}