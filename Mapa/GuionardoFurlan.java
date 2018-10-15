package progsis2.cesumar;

import robocode.*;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * GuionardoFurlan - a robot by Guionardo Furlan
 */
public class GuionardoFurlan extends Robot {
	/**
	 * run: GuionardoFurlan's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// 2. Altere a cor do seu robô.
		setBodyColor(Color.green);

		// 3. Altere a cor da bala.
		setBulletColor(Color.red);

		// Robot main loop
		while (true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
		}
	}

	/**
	 * onScannedRobot: O que fazer quando visualizar outro robô
	 * 9.
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(1);
	}

	/**
	 * onHitByBullet: O que fazer quando atingido por outro robô
	 * 9. 
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		back(10);
	}

	/**
	 * onHitWall: O que fazer quando bater em uma parede
	 * 9. 
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
	}

	/**
	 * 5.a virarPraDireita: apelido para turnRight(90)
	 */
	public void virarPraDireita() {
		turnRight(90);
	}

	/**
	 * 5.b virarPraEsquerda: apelido para turnLeft(90)
	 */
	public void virarPraEsquerda() {
		turnLeft(90);
	}

	/**
	 * 5.c virarPraTras: apelido para turnLeft(180)
	 */
	public void virarPraTras() {
		turnLeft(180);
	}

	/**
	 * 5.d andarPraFrente: apelido para ahead
	 * 
	 * @param quantosPixels
	 */
	public void andarPraFrente(double quantosPixels) {
		ahead(quantosPixels);
	}

	/**
	 * 5.e andarPraTras: apelido para back
	 * 
	 * @param quantosPixels
	 */
	public void andarPraTras(double quantosPixels) {
		back(quantosPixels);
	}

	/**
	 * 5.f atirar: apelido para fire
	 * 
	 * @param energiaDaBala
	 */
	public void atirar(double energiaDaBala) {
		fire(energiaDaBala);
	}

	/**
	 * 5.g parar: apelido para stop
	 */
	public void parar() {
		stop();
	}
}
