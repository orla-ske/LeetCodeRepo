class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        List<String> invalid = new ArrayList<>();

        for (int i = 0; i < transactions.length; i++) {
            String[] current = transactions[i].split(",");
            int amount = Integer.parseInt(current[2]);

            if (amount > 1000) {
                invalid.add(transactions[i]);
                continue;
            }

            boolean isInvalid = false;

            for (int j = 0; j < transactions.length; j++) {
                if (i != j) {
                    String[] other = transactions[j].split(",");
                    int currentTime = Integer.parseInt(current[1]);
                    int otherTime = Integer.parseInt(other[1]);
                    int timeDiff = Math.abs(currentTime - otherTime);
                    if (current[0].equals(other[0]) && !current[3].equals(other[3]) && timeDiff <= 60) {
                        isInvalid = true;
                        break;
                    }
                }
            }

            if (isInvalid) {
                invalid.add(transactions[i]);
            }
        }

        return invalid;
    }
}