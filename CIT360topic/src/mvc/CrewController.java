package mvc;

public class CrewController {
	   private CrewMember model;
	   private CrewView view;

	   public CrewController(CrewMember model, CrewView view){
	      this.model = model;
	      this.view = view;
	   }

	   public void setCrewMemberName(String name){
	      model.setName(name);		
	   }

	   public String getCrewMemberName(){
	      return model.getName();		
	   }

	   public void setCrewMemberRoll(String roll){
	      model.setRoll(roll);		
	   }

	   public String getCrewMemberRoll(){
	      return model.getRoll();		
	   }
	   
	   

	   public void updateView(){				
	      view.printCrewDetails(model.getName(), model.getRoll());
	   }	
	}
