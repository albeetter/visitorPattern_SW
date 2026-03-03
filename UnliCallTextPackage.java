public class UnliCallTextPackage implements  UnliCallOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (telcoName.equalsIgnoreCase("Smart")) {
            return "No free calls and texts, charged per use.";
        } else if (telcoName.equalsIgnoreCase("Globe")) {
            return "Unlimited calls and texts to same network. Extra charges for others.";
        } else if (telcoName.equalsIgnoreCase("Ditto")) {
            return "Unlimited calls and texts to all networks.";
        }
        return "Unknown Package";
    }
}