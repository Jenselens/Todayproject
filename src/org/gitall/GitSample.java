package org.gitall;

public class GitSample {
	private void name() {
		System.out.println("Name");
	}

	private void age() {
		System.out.println("Age");
	}

	// paste the tail content above the head
	private void education() {
		System.out.println("Education");
	}

	private void school() {
		System.out.println("School");
	}

	public static void main(String[] args) {
		GitSample g = new GitSample();
		g.name();
		g.age();
		g.education();

		g.school();

	}

}
