# Ejemplo de uso del módulo de SendGrid

```java
boolean result;
try {
    SendGrid sg = new SendGrid("SENDGRID_API_KEY");
    Request request = new Request();
    request.setMethod(Method.POST);
    request.setEndpoint("mail/send");

    final String jsonRequestFormat ="{\"personalizations\":[" +
                                        "{\"to\":[{\"email\":\"%s\"}]," +
                                        "\"subject\":\"%s\"}]," +
                                        "\"from\":{\"email\":\"%s\"}," +
                                        "\"content\":[{\"type\":\"text/plain\", " +
                                        "\"value\": \"%s\"}]}";
    String jsonRequest = String.format(jsonRequestFormat, "to@mail.com", "Mail subject",
                                        "from@mail.com", "This is the mail body");
    request.setBody(jsonRequest);

    Response response = sg.api(request);
    System.out.println(response.getStatusCode());
    System.out.println(response.getBody());
    System.out.println(response.getHeaders());

    result = response.getStatusCode() == 200;

} catch (IOException ex) {
    System.err.println("SendGrid - The email was not sent. Error message: "  + ex.getMessage());
    result = false;
}
```