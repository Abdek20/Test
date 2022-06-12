package AbstraiteInterface;

public abstract class PersonneImpl implements Personne {
protected String nom;
protected int age;

@Override
public String getName(){
	return nom;
}
@Override
public void setAge(int Age){
	this.age=Age;
}
@Override
public int getAge(){
	return age;
}
@Override
public  abstract String getUniqueId();


public void Affiche(){
	System.out.println("[identifiantUnique ]:"  + nom +   "  age :" +age);
}

public void Comparer(PersonneImpl p){
	if(this.getName().equals(p.getName()) && this.getAge()==p.getAge()){
		System.out.println("Egalite");
	}
	else {
		System.out.println("C'est different");
	}
}

PersonneImpl(String nom,int age){
	this.nom=nom;
	this.age=age;
}













}
