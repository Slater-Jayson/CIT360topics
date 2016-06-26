package mvc;

public class putogethermvc {
	   public static void main(String[] args) {

	      
	      CrewMember model  = retriveCrewMemberFromDatabase();

	      
	      CrewView view = new CrewView();

	      CrewController controller = new CrewController(model, view);

	      controller.updateView();

	      //updating model
	      controller.setCrewMemberName("Spock");
	      controller.setCrewMemberDuty("1st Lieutenant");
	      controller.updateView();
	   }

	   private static CrewMember retriveCrewMemberFromDatabase(){
	      CrewMember crewmember = new CrewMember();
	      crewmember.setName("James T. Kirk");
	      crewmember.setDuty("Captain");
	      
	      return crewmember;
	   }
	}
