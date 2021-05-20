package model;
public class Planet{
	public double xxPos;
	public double yyPos;
	public double xxVel;
	public double yyVel;
	public double mass;
	public String imgFileName;
	public static final double G = 6.67E-11;

	public Planet(double xP, double yP, double xV, double yV, double m, String img){
		this.xxPos = xP;
		this.yyPos = yP;
		this.xxVel = xV;
		this.yyVel = yV;
		this.mass = m;
		this.imgFileName = img;
	}

	public Planet(Planet p){
		this.xxPos = p.xxPos;
		this.yyPos = p.yyPos;
		this.xxVel = p.xxVel;
		this.yyVel = p.yyVel;
		this.mass = p.mass;
		this.imgFileName = p.imgFileName;
	}


	public double calcDistance(Planet p){
		double dist = 0;
		dist = (this.xxPos - p.xxPos) * (this.xxPos - p.xxPos) +
		 	   (this.yyPos - p.yyPos) * (this.yyPos - p.yyPos);
		dist = Math.sqrt(dist);

		return dist;
	}

	public double calcForceExertedBy(Planet p){
		double force = 0;
		double rsqrt = this.calcDistance(p) * this.calcDistance(p);
		force = Planet.G * (this.mass * p.mass / 
				rsqrt);

		return force;
	}
}
