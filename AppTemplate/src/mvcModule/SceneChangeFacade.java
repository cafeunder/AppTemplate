package mvcModule;

public class SceneChangeFacade {
	private Controller controller;
	
	public SceneChangeFacade(Controller controller){
		this.controller = controller;
	}
	
	public void sceneChange(SceneFactory.SCENE_ID id){
		controller.sceneChange(id);
	}
	public void sceneChange(SceneFactory.SCENE_ID id, int stage_num){
		controller.sceneChange(id,stage_num);
	}
}