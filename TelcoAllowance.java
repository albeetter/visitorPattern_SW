public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, double money) {
        if (telcoName.equalsIgnoreCase("Smart")) return "15 GB for ₱" + money;
        if (telcoName.equalsIgnoreCase("Globe")) return "10 GB for ₱" + money;
        if (telcoName.equalsIgnoreCase("Ditto")) return "8 GB for ₱" + money;
        return "Unknown Data Offer";
    }
}
