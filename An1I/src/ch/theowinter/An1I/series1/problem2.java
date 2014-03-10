package ch.theowinter.An1I.series1;

import ch.theowinter.An1I.utilities.LogicEngine;

public class problem2 {
	static LogicEngine logic = new LogicEngine();

	/**
	 * Beim Bau eines 100 m hohen Fernsehturmes
	 * ist eine Aussichtsplatform geplant, die im Falle einer Katastrophe
	 * so schnell wie möglich evakuiert werden muss. Für die Evakuierung
	 * stehen zwei Varianten zur Diskussion
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int peopleInTower = 1000;
		logic.print("Elevator Option: "+optionElevator(peopleInTower)+"seconds");
		logic.print("Stair Option: "+optionStairs(peopleInTower)+"seconds");
	}
	
	/**
	 * Der Bau eines Fahrstuhls, der pro Fahrt 50 Personen evakuieren kann.
	 * Der geplante Fahrstuhl benötigt für die Abfahrt und die Auffahrt
	 * jeweils 20s Zeit. Für das Betreten und Verlassen des Fahrstuhls inkl.
	 * dem Öffnen und Schliessen der Türen wird im Katastrophenfall mit jeweils 15
	 * Sekunden pro Fahrt gerechnet.
	 *
	 * @param numberOfPeopleOnTower
	 * @return
	 */
	public static int optionElevator(int numberOfPeopleOnTower){
		int timeItTakesToEvacuateInSeconds = 0;
		while(numberOfPeopleOnTower>0){
			//Open close doors per ride 15s, up&down 40s
			timeItTakesToEvacuateInSeconds +=55;
			//Each ride evacuates 50ppl
			numberOfPeopleOnTower -=50;
		}
		return timeItTakesToEvacuateInSeconds;
	}
	
	public static int optionStairs(int numberOfPeopleOnTower){
		int timeItTakesToEvacuateInSeconds = 5*60*10;
		while(numberOfPeopleOnTower>0){
			timeItTakesToEvacuateInSeconds +=7;
			numberOfPeopleOnTower -=3;
		}
		return (timeItTakesToEvacuateInSeconds/10);
	}
}
