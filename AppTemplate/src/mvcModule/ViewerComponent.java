package mvcModule;

public abstract class ViewerComponent {
	protected SceneChangeFacade scfacade;

	public ViewerComponent(SceneChangeFacade scfacade){
		this.scfacade = scfacade;
	}
	
	public abstract void draw();
}