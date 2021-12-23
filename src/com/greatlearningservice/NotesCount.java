package com.greatlearningservice;

public class NotesCount {

	public void notesCountImplementation(int[] notes,int size, int amount) {
		// TODO Auto-generated method stub

		int i = 0; int check =0; int j = 0;
	int[] notesrequired = new int[notes.length];
	while(amount> 0 && i<notes.length)
	{
		int countRequired = amount/notes[i];
		amount = amount -(countRequired * notes[i]);
				notesrequired[i] =  countRequired;
				i++;
	}
	if(amount==0)
	{
		System.out.println("Your payment aprocach in order to give min no of notes will be");
		for( j = 0 ; j< notesrequired.length; j++)
		{
			if(notesrequired[j] !=0)
			{
				 check = 1;
				System.out.println(notes[j] + ":" + notesrequired[j]);
				 
			}
		
		
		}
	
	}if(check ==0)
	{
		System.out.println("Notvalid");
	}
		
}}
	