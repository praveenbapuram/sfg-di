package guru.springframework.sfgdi.examplebeans;

public class FakeServiceDetails {
    private String endpoint;
    private String secret;

    @Override
    public String toString() {
        return "FakeServiceDetails{" +
                "endpoint='" + endpoint + '\'' +
                ", secret='" + secret + '\'' +
                '}';
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
