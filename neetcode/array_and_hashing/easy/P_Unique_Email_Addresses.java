package array_and_hashing.easy;

import java.util.HashSet;
import java.util.Set;

public class P_Unique_Email_Addresses {
    class Solution {
        public int numUniqueEmails(String[] emails) {
            Set<String> uniqueEmails = new HashSet<>();

            for (String email : emails) {
                String[] parts = email.split("@");
                String localName = parts[0];
                String domainName = parts[1];

                if (localName.contains("+")) {
                    String[] localParts = localName.split("\\+");
                    localName = localParts[0];
                }

                localName = localName.replace(".", "");

                uniqueEmails.add(localName + "@" + domainName);
            }

            return uniqueEmails.size();
        }
    }

}
