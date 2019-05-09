package fr.pizzeria.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class PizzaMemoDao implements IPizzaDao {
	
	Scanner questionUser = new Scanner(System.in);
	
	public List listPizza = new ArrayList ();
	
	public void initialisation () {
		
		listPizza.add(new Pizza (0 ,"PEP" , "pépéroni" , 12.50)) ;
		listPizza.add(new Pizza (1 ,"MAR" , "Margherita" , 14.00)) ;
		listPizza.add(new Pizza (2 ,"REIN" , "La Reine" , 11.50)) ;
		listPizza.add(new Pizza (3 ,"FRC" , "La 4 Fromage" , 12.00)) ;
		listPizza.add(new Pizza (4 ,"CAN" , "La Cannibale" , 12.50)) ;
		listPizza.add(new Pizza (5 ,"SAV" , "La Savoyarde" , 13.00)) ;
		listPizza.add(new Pizza (6 ,"ORI" , "L'Orientale" , 13.50)) ;
		listPizza.add(new Pizza (7 ,"IND" , "L'Indienne" , 14.00)) ; 
		
	}
	
	
	public List <Pizza> findAllPizzas() {
		
		
		return listPizza ;
		
	}
	
	public void saveNewPizza(Pizza pizza) {
		
		listPizza.add(pizza) ;
		
	}
	
	public void updatePizza(String codePizza, Pizza pizza) {
		
		listPizza.remove (codePizza) ;
		listPizza.add(pizza) ;
		
	}
	public void deletePizza(String codePizza) {
		
		listPizza.remove(codePizza) ;
		
	}
	
	public Pizza findPizzaByCode(String codePizza) {
		
		
		int indice = 0 ;
		for ( int i = 0 ; i < listPizza.size() ; i++ ) {
			if (listPizza.get(i).code.compareTo(codePizza) == 0) {
				indice = i ;
				//Pizza findPizza = (Pizza).get(i) ;
			}
		}
		
		

		return listPizza() ;
		
	}
	
	public boolean pizzaExists(String codePizza) {
		
		return listPizza.contains(codePizza) ;
	}
}
