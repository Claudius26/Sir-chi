import java.util.Scanner;

public class MBTI
{

	public static void main(String... args)
	{

		Scanner scan = new Scanner(System.in);

		System.out.printf("%s", "Enter your name first name: ");
		String name = scan.next();

		System.out.printf("%s", "Enter your name last name: ");
		String surname = scan.next();

		System.out.printf("%s %s", surname, name);

		int extrovert = 0;
		int introvert = 0;
		int sensing = 0;
		int intuitive = 0;
		int thinking = 0;
		int feeling = 0;
		int judging = 0;
		int perceptive = 0;

		
		System.out.printf("%n%s%n%s %s%n","Enter A or B", "expend energy,enjoy group or ", "conserve energy, enjoy one-on-one");
		String response = scan.next().replaceAll("\\s", "").toLowerCase();

		while(!response.equals("a")  && !response.equals("b"))
		{

		System.out.println("I know this is an error,please try again");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		}

		switch(response)
		{
			case "a":
				extrovert++;

				System.out.println("expend energy,enjoy group ");

				break;

			case "b":

				introvert++;

				System.out.println("conserve energy, enjoy one-on-one");

				break;

		}

		System.out.printf("%s%s%n","more outgoing,think out loud or ", "more reserved, think to your self");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		while(!response.equals("a")  && !response.equals("b"))
		{

		System.out.println("I know this is an error,please try again");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		}

		switch(response)
		{
			case "a":
				extrovert++;

				System.out.println("more outgoing,think out loud ");

				break;

			case "b":

				introvert++;

				System.out.println("more reserved, think to your self");

				break;

		}

		System.out.printf("%s%s%n","seek many tasks,public activities,interract with others or ", "seek private, solitary activities with quiet to concentrate");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		while(!response.equals("a")  && !response.equals("b"))
		{

		System.out.println("I know this is an error,please try again");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		}

		switch(response)
		{
			case "a":
				extrovert++;

				System.out.println("seek many tasks,public activities,interract with others ");

				break;

			case "b":

				introvert++;

				System.out.println("seek private, solitary activities with quiet to concentrate");

				break;

		}

		System.out.printf("%s%s%n","external,communicative,express yourself or ", "internal, reticent,keep to yourself");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		while(!response.equals("a")  && !response.equals("b"))
		{

		System.out.println("I know this is an error,please try again");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		}

		switch(response)
		{
			case "a":
				extrovert++;

				System.out.println("external,communicative,express yourself");

				break;

			case "b":

				introvert++;

				System.out.println("internal, reticent,keep to yourself");

				break;

		}

		System.out.printf("%s%s%n","active,initiate or ", "reflective, delibrate");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		while(!response.equals("a")  && !response.equals("b"))
		{

		System.out.println("I know this is an error,please try again");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		}

		switch(response)
		{
			case "a":
				extrovert++;

				System.out.println("active,initiate ");

				break;

			case "b":

				introvert++;

				System.out.println("reflective, delibrate");

				break;

		}

		System.out.printf("%s%s%n","interpret literally or ", "looking for meaning and possibilities");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		while(!response.equals("a")  && !response.equals("b"))
		{

		System.out.println("I know this is an error,please try again");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		}

		switch(response)
		{
			case "a":
				sensing++;

				System.out.println("interpret literally");

				break;

			case "b":

				intuitive++;

				System.out.println("looking for meaning and possibilities");

				break;

		}

		System.out.printf("%s%s%n","practical,realistic,experiential or ", "imaginative, innovative, theoritical");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		while(!response.equals("a")  && !response.equals("b"))
		{

		System.out.println("I know this is an error,please try again");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		}

		switch(response)
		{
			case "a":
				sensing++;

				System.out.println("practical,realistic,experiential");

				break;

			case "b":

				intuitive++;

				System.out.println("imaginative, innovative, theoritical");

				break;

		}

		System.out.printf("%s%s%n","Standard,usual,conventional or ", "Different, novel, unique");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		while(!response.equals("a")  && !response.equals("b"))
		{

		System.out.println("I know this is an error,please try again");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		}

		switch(response)
		{
			case "a":
				sensing++;

				System.out.println("Standard,usual,conventional");

				break;

			case "b":

				intuitive++;

				System.out.println("Different, novel, unique");

				break;

		}

		System.out.printf("%s%s%n","focus on here-and-now or ", "look to the future,global perspective,big picture");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		while(!response.equals("a")  && !response.equals("b"))
		{

		System.out.println("I know this is an error,please try again");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		}

		switch(response)
		{
			case "a":
				sensing++;

				System.out.println("focus on here-and-now");

				break;

			case "b":

				intuitive++;

				System.out.println("look to the future,global perspective,big picture");

				break;

		}

		System.out.printf("%s%s%n","facts,things, what is or ", "ideas, dreams, what could be, philosophical");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		while(!response.equals("a")  && !response.equals("b"))
		{

		System.out.println("I know this is an error,please try again");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		}

		switch(response)
		{
			case "a":
				sensing++;

				System.out.println("facts,things, what is");

				break;

			case "b":

				intuitive++;

				System.out.println("ideas, dreams, what could be, philosophical");

				break;

		}

		System.out.printf("%s%s%n","logical,thinking, questioning or ", "empathetic, feelings, accomodating");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		while(!response.equals("a")  && !response.equals("b"))
		{

		System.out.println("I know this is an error,please try again");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		}

		switch(response)
		{
			case "a":
				thinking++;

				System.out.println("logical,thinking, questioning");

				break;

			case "b":

				feeling++;

				System.out.println("empathetic, feelings, accomodating");

				break;

		}

		System.out.printf("%s%s%n","candid,straightforward, frank or ", "tactful, kind, encouraging");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		while(!response.equals("a")  && !response.equals("b"))
		{

		System.out.println("I know this is an error,please try again");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		}

		switch(response)
		{
			case "a":
				thinking++;

				System.out.println("candid,straightforward, frank");

				break;

			case "b":

				feeling++;

				System.out.println("tactful, kind, encouraging");

				break;

		}

		System.out.printf("%s%s%n","firm,tend to criticize, hold the line or ", "gentle, tend to appreciate, conciliate");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		while(!response.equals("a")  && !response.equals("b"))
		{

		System.out.println("I know this is an error,please try again");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		}

		switch(response)
		{
			case "a":
				thinking++;

				System.out.println("firm,tend to criticize, hold the line");

				break;

			case "b":

				feeling++;

				System.out.println("gentle, tend to appreciate, conciliate");

				break;

		}

		System.out.printf("%s%s%n","tough-minded, just,  or ", "tender-hearted, merciful");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		while(!response.equals("a")  && !response.equals("b"))
		{

		System.out.println("I know this is an error,please try again");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		}

		switch(response)
		{
			case "a":
				thinking++;

				System.out.println("tough-minded, just");

				break;

			case "b":

				feeling++;

				System.out.println("tender-hearted, merciful");

				break;

		}

		System.out.printf("%s%s%n","matter of facts, issue-oriented  or ", "sensitive,people-oriented, compassionate");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		while(!response.equals("a")  && !response.equals("b"))
		{

		System.out.println("I know this is an error,please try again");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		}

		switch(response)
		{
			case "a":
				thinking++;

				System.out.println("matter of facts, issue-oriented");

				break;

			case "b":

				feeling++;

				System.out.println("sensitive,people-oriented, compassionate");


				break;

		}

		System.out.printf("%s%s%n","organized, orderly  or ", "flexible,adaptable");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		while(!response.equals("a")  && !response.equals("b"))
		{

		System.out.println("I know this is an error,please try again");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		}

		switch(response)
		{
			case "a":
				judging++;

				System.out.println("organized, orderly");

				break;

			case "b":

				perceptive++;

				System.out.println("flexible,adaptable");


				break;

		}

		System.out.printf("%s%s%n","plan, schedule  or ", "unplanned,spontaneous");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		while(!response.equals("a")  && !response.equals("b"))
		{

		System.out.println("I know this is an error,please try again");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		}

		switch(response)
		{
			case "a":
				judging++;

				System.out.println("plan, schedule");

				break;

			case "b":

				perceptive++;

				System.out.println("unplanned,spontaneous");


				break;

		}

		System.out.printf("%s%s%n","regulated, structured  or ", "easy-going, live and let live");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		while(!response.equals("a")  && !response.equals("b"))
		{

		System.out.println("I know this is an error,please try again");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		}

		switch(response)
		{
			case "a":
				judging++;

				System.out.println("regulated, structured");

				break;

			case "b":

				perceptive++;

				System.out.println("easy-going, live and let live");


				break;

		}

		System.out.printf("%s%s%n","preparation, plan ahead  or ", "go with the flow, adapt as you go");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		while(!response.equals("a")  && !response.equals("b"))
		{

		System.out.println("I know this is an error,please try again");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		}

		switch(response)
		{
			case "a":
				judging++;

				System.out.println("preparation, plan ahead");

				break;

			case "b":

				perceptive++;

				System.out.println("go with the flow, adapt as you go");


				break;

		}

		System.out.printf("%s%s%n","control, govern  or ", "latitude, freedom");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		while(!response.equals("a")  && !response.equals("b"))
		{

		System.out.println("I know this is an error,please try again");
		response = scan.next().replaceAll("\\s", "").toLowerCase();

		}

		switch(response)
		{
			case "a":
				judging++;

				System.out.println("control, govern");

				break;

			case "b":

				perceptive++;

				System.out.println("latitude, freedom");


				break;

		}


		if(extrovert > introvert)
		{
		System.out.print("\n" + "Your energy orientation is:Extrovert ");
        
		}

		else
		{

		System.out.print("\n" + "Your energy orientation is:Intovert ");

		}

		if(sensing > intuitive)
		{
		System.out.print("\n" + "Your energy orientation is: Sensing");
        	
		}

		else
		{

		System.out.print("\n" + "Your energy orientation is:Intuitive ");

		}

		if(thinking > feeling)
		{

		System.out.print("\n" + "Your energy orientation is: Thinking");

		}

		else
		{

		System.out.print("\n" + "Your energy orientation is: Feeling");
        	
		}

		if(judging > perceptive)
		{
		System.out.print("\n" + "Your energy orientation is: judging");
       
		}

		else
		{

		System.out.print("\n" + "Your energy orientation is: perceptive");

		}


		System.out.println("\n" + "Hello " + surname + " " +  name + " Your full MBTI personality type is: ");

       		System.out.print((extrovert > introvert ? "E" : "I"));

       		System.out.print((sensing > intuitive ? "S" : "N"));

        	System.out.print((thinking > feeling ? "T" : "F"));

        	System.out.print((judging > perceptive ? "J" : "P"));

        	//System.out.println();

	}

}