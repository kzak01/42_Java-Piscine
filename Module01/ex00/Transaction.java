/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Transaction.java                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kzak <kzak@student.42.fr>                  +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/04/17 12:00:07 by kzak              #+#    #+#             */
/*   Updated: 2023/04/17 15:34:44 by kzak             ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package Module01.ex00;

import java.util.UUID;

public class Transaction {
	private UUID	identifier;
	private User	recipient;
	private User	sender;
	private TransferCategory	transferCategory;
	private double	transferAmount;

	public enum TransferCategory {
		DEBITS,
		CREDITS
	}

	public Transaction(User recipient, User sender,
			TransferCategory transferCategory, double transferAmount) {
		this.identifier = UUID.randomUUID();
		this.recipient = recipient;
		this.sender = sender;
		this.transferCategory = transferCategory;
		setTransferAmount(transferAmount);
	}

	public UUID getIdentifier() {
		return identifier;
	}

	public User getRecipient() {
		return recipient;
	}

	public User getSender() {
		return sender;
	}

	public TransferCategory getTransferCategory() {
		return transferCategory;
	}

	public double getTransferAmount() {
		return transferAmount;
	}

	public void setIdentifier(UUID id) {
		this.identifier = id;
	}
	
	public void setRecipient(User recipient) {
		this.recipient = recipient;
	}

	public void setSendet(User sender) {
		this.sender = sender;
	}

	public void setTransferCategory(TransferCategory transferCategory) {
		this.transferCategory = transferCategory;
	}

	public void setTransferAmount(double transferAmount) {
		if (this.transferCategory == TransferCategory.CREDITS
			&& (transferAmount > 0 || sender.getBalance() < transferAmount)) {
			this.transferAmount = 0.0;
			System.out.println("Transaction failed.");
		} else if (this.transferCategory == TransferCategory.DEBITS
			&& (transferAmount < 0 || sender.getBalance() < transferAmount)) {
			this.transferAmount = 0.0;
			System.out.println("Transaction failed.");
		} else {
			this.transferAmount = transferAmount;
			if (transferCategory == TransferCategory.CREDITS) {
				recipient.setBalance(recipient.getBalance() - transferAmount);
				sender.setBalance(sender.getBalance() + transferAmount);
			} else {
				recipient.setBalance(recipient.getBalance() + transferAmount);
				sender.setBalance(sender.getBalance() - transferAmount);
			}
			System.out.println("Transaction succesfully finish.");
		}
	}

	public String toString() {
		return "\033[0;32mRecipient: \033[0m" + recipient
				+ "\033[0;32m\nSender: \033[0m" + sender
				+ "\033[0;32m\nIdentifier: \033[0m" + identifier
				+ "\033[0;32m\nTransfer Amount: \033[0m" + transferAmount;
	}
}
