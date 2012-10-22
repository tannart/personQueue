public class Person{
    private int items;
	private Person next, prev, end;
	private static int queueSize = 0;
	
	public Person(int items){
	this.items = items;
	this.next = null;
	this.prev = null;
	}
	
	public Person getNext(){
	    return next;
	}
	
	public Person getPrev(){
	    return prev;
	}

	public int getItems(){
	    return items;
	}

	public int getQueueSize(){
	    return queueSize;
	}

	
	public void addPerson(Person newPerson){
        if(this.next == null){
		    this.next = newPerson;
			newPerson.prev = this;
			queueSize++;
			System.out.println(newPerson.getItems());
		} else { 
		    this.next.addPerson(newPerson);
		}
	}
	
	public void servePerson(){
	    this.next = this.next.getNext();
		queueSize--;
	}	
}
	