public class Supermarket{

    public static void main(String[] args){
	    Person personBegin = new Person(0);
	
	    Person firstPerson = new Person(15);
	    Person secondPerson = new Person(13);
	    Person thirdPerson = new Person(12);
	    Person fourthPerson = new Person(19);
	    Person fifthPerson = new Person(43);
	    Person sixthPerson = new Person(39);
	    Person seventhPerson = new Person(11);
	
	    personBegin.addPerson(firstPerson);
	    personBegin.addPerson(secondPerson);
	    personBegin.addPerson(thirdPerson);
	    personBegin.addPerson(fourthPerson);
	    personBegin.addPerson(fifthPerson);
	    personBegin.addPerson(sixthPerson);
	    personBegin.addPerson(seventhPerson);
		
		personBegin = firstPerson;
	
	    System.out.print("There are " + personBegin.getQueueSize());
		System.out.println(" people in the queue.");
		
		
		personBegin.servePerson();
		personBegin.servePerson();
		personBegin.servePerson();
		
		while(personBegin != null){
		    System.out.println(personBegin.getItems());
			personBegin = personBegin.getNext();
		}
	
	    System.out.print("There are " + personBegin.getQueueSize());
		System.out.println(" people in the queue.");
	}
}