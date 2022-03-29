##Comparison between the DodgyBankAccount Class and SecureBankAccount Class

#DodgyBankAccount Class

* There is no encapsulation and the access modifiers for all the class attributes and methods are public.
This means they can be accessed from inside the class and also from anywhere outside the class.
This leaves all class members unhidden and open to misuse.

* Anyone can change the values for the accountNumber, accountBalance and rewardAmount to any value they wish. 
The accountBalance and rewardAmount could be set to more than the actual value.

* The method to add the rewards to the bank account  can be called from outside the class by anyone. 
This could be called multiple times to add rewards that would not otherwise apply.





#SecureBankAccount Class

The use of Encapsulation offers a layer of security and prevents misuse by ensuring that;

- All the member attributes are private so that they can only be accessed by the member methods of the class. The data they hold is hidden from public use.
- In addition to being private the ACCOUNTNUMBER and REWARDAMOUNT are declared as final. They have been assigned values that remain constant and hence cannot be changed by the member methods.
- The addReward() member method is private and can only be called by another member method of the class. This is hidden from public use.
- The constructor is public. This can be called by anyone outside the class to instantiate a SecureBankAccount object however it accesses the private member attributes that are hidden from public use.
- The displayAccountBalance() member method is public. This can be called from outside the class to display current value of the accountBalance member attribute which is hidden from public use.
- The debitAmount() member method is public. This can be called form outside the class to display the value of the accountBalance member attribute after a withdrawal.

#Conclusion

* By making member attributes private ensures that they are hidden from public use and can only be accessed by member methods to display their values or calculate the value of other attributes.
* By making specific methods private ensures that they can only be called by member methods and hidden from public use.
* By making specific member methods public allows the value of  private attributes to be displayed but not modified.