public class Person implement PersonQueue{
    private int age;
	private String name;
	private Person next, previous, head, tail;
	private static int queueSize;
	
	public Person(int age, String name){
	this.age = age;
	this.name = name;
	this.next = null;
	this.previous = null;
	}
	
	public Person getNext(){
	    return next;
	}
	public Person getPrev(){
	    return prev;
	}
	public String getName(){
	    return name;
	}
	public int getAge(){
	    return age;
	}
	public Person getHead(){
	    return head;
	}
	
	public void insert(Person newPerson){
	    if(this.next == null){
		    this.next = newPerson;
			newPerson.prev = this;
		} else { 
		    this.next.addPerson(newPerson);
		}
	}
	
	public boolean deletePerson(Person thePerson){
	    if(this.next == null){
		    return false;
		} else if(this.next.name.equals(thePerson.name)){
		    this.next = next.next;
			this.next.next.prev = this;
			return true;
		} else {
		    return this.next.deletePerson(thePerson);
		}
	}
}
	