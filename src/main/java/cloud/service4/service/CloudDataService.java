package cloud.service4.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(prefix = "ncp.client.service", name = "dev", havingValue = "false", matchIfMissing = true)
public class CloudDataService implements DataService {
    public String getDefaultQuote() {
        return "in cloud mode";
    }
}
