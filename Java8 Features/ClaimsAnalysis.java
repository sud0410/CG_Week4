import java.util.*;
import java.util.stream.Collectors;

class Claim {
    String claimId;
    String policyNumber;
    double claimAmount;
    String status;

    public Claim(String claimId, String policyNumber, double claimAmount, String status) {
        this.claimId = claimId;
        this.policyNumber = policyNumber;
        this.claimAmount = claimAmount;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Claim{claimId=" + claimId + ", amount=" + claimAmount + ", status=" + status + "}";
    }
}

public class ClaimsAnalysis {
    public static Map<String, Double> analyzeClaims(List<Claim> claims) {
        return claims.stream()
                .filter(c -> "Approved".equals(c.status) && c.claimAmount > 5000)
                .collect(Collectors.groupingBy(c -> c.policyNumber,
                        Collectors.summingDouble(c -> c.claimAmount)));
    }

    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
                new Claim("C1", "PN1", 6000, "Approved"),
                new Claim("C2", "PN2", 4000, "Pending"),
                new Claim("C3", "PN1", 10000, "Approved")
        );
        Map<String, Double> result = analyzeClaims(claims);
        System.out.println("Claims by policy: " + result);
    }
}
