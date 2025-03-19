package exceptions;

public class VotingApp {
	
	public void validate(int age) throws InvalidAgeException {
		if(age<18)
			throw new InvalidAgeException("under age: <18");
		else
			System.out.println("Welcome to Vote");
	}

	public static void main(String[] args) {
		VotingApp vote = new VotingApp();
		
		try {
		vote.validate(21);
		vote.validate(15);
        }
		catch (Exception e) {
			System.err.println(e);
		}
		finally {
			vote = null;
			System.out.println("vote object closed");
		}
			System.out.println("Rest of the code follows....");
		}

}
