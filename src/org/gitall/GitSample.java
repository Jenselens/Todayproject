package org.gitall;

public class GitSample {
	private void name() {
		System.out.println("Name");
	}
	private void age() {
		System.out.println("Age");
	}
	private void education() {
		System.out.println("Education");
	}
	public static void main(String[] args) {
		GitSample g = new GitSample();
		g.name();
		g.age();
		g.education();
	}
	
}
