import java.util.ArrayList;

public class WalletService {

    ArrayList<Transaction> transactions = new ArrayList<>();

    public void sendMoney(Wallet sender, Wallet receiver, double amount) {

        if (sender.getBalance() >= amount) {

            sender.deductBalance(amount);
            receiver.addBalance(amount);

            Transaction transaction = new Transaction(
                    sender.getOwnerName(),
                    receiver.getOwnerName(),
            
