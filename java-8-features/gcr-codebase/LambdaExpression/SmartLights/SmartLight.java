package LambdaExpression.SmartLights;

public class SmartLight {
	
	public void activate(LightAction action) {
        action.execute();
    }

}
