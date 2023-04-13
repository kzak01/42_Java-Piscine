
import java.util.UUID;

public class Transaction {
	private UUID	_id;
	private User	_reciver;
	private User	_sender;
	private String	_transferMoney;
	private double	_transferAmount;

	public Transaction(User reciver, User sender, String transferMoney, double transferAmount) {
		this._id = UUID.randomUUID();
		this._reciver = reciver;
		this._sender = sender;
		this._transferMoney = transferMoney;
		this._transferAmount = transferAmount;
	}

	public UUID getId() {
		return _id;
	}

	public User getReciver() {
		return _reciver;
	}

	public User getSender() {
		return _sender;
	}

	public String getTransferMoney() {
		return _transferMoney;
	}

	public double getTransferAmount() {
		return _transferAmount;
	}

	public String toString() {
		return "Transaction: id = " + _id +
				", reciver= " + _reciver +
				", sender= " + _sender +
				", transferMoney= '" + _transferMoney +
				'\'' + ", transferAmount= " + _transferAmount + "\n";
	}
}
