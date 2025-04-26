import java.util.*;
import java.util.stream.Collectors;

class PolicyHolder {
    String holderId;
    String name;
    int age;
    String policyType;
    double premiumAmount;

    public PolicyHolder(String holderId, String name, int age, String policyType, double premiumAmount) {
        this.holderId = holderId;
        this.name = name;
        this.age = age;
        this.policyType = policyType;
        this.premiumAmount = premiumAmount;
    }
}

public class RiskAssessment {
    public static List<String> assessRisk(List<PolicyHolder> holders) {
        return holders.stream()
                .filter(p -> "Life".equals(p.policyType) && p.age > 60)
                .map(p -> p.name + " - Risk Score: " + (p.premiumAmount / p.age))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<PolicyHolder> holders = Arrays.asList(
                new PolicyHolder("H1", "Sudarsan", 65, "Life", 40000),
                new PolicyHolder("H2", "Sridharamn", 70, "Life", 30000)
        );
        List<String> risks = assessRisk(holders);
        System.out.println("Risk Assessment: " + risks);
    }
}
