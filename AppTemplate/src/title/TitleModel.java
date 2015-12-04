package title;

import system.MouseFacade;
import mvcModule.Model;
import mvcModule.SceneChangeFacade;
import mvcModule.SceneFactory;

public class TitleModel extends Model {
	public TitleModel(SceneChangeFacade scfacade){
		super(scfacade);
	}
	
	public void timerUpdate(){};
	public void mousePressUpdate(MouseFacade mfacade){
		if(mfacade.getMouseLeftPressCount() == 1) scfacade.sceneChange(SceneFactory.SCENE_ID.GAME,0);
		if(mfacade.getMouseRightPressCount() == 1) scfacade.sceneChange(SceneFactory.SCENE_ID.GAME,1);		
	};
	public void mouseMoveUpdate(MouseFacade mfacade){};
}
