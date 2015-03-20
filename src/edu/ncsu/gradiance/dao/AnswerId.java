package edu.ncsu.gradiance.dao;

// Generated Oct 20, 2014 5:39:06 PM by Hibernate Tools 4.3.1

/**
 * AnswerId generated by hbm2java
 */
public class AnswerId implements java.io.Serializable {

	private int qid;
	private int seed;
	private int ansid;

	public AnswerId() {
	}

	public AnswerId(int qid, int seed, int ansid) {
		this.qid = qid;
		this.seed = seed;
		this.ansid = ansid;
	}

	public int getQid() {
		return this.qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public int getSeed() {
		return this.seed;
	}

	public void setSeed(int seed) {
		this.seed = seed;
	}

	public int getAnsid() {
		return this.ansid;
	}

	public void setAnsid(int ansid) {
		this.ansid = ansid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AnswerId))
			return false;
		AnswerId castOther = (AnswerId) other;

		return (this.getQid() == castOther.getQid())
				&& (this.getSeed() == castOther.getSeed())
				&& (this.getAnsid() == castOther.getAnsid());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getQid();
		result = 37 * result + this.getSeed();
		result = 37 * result + this.getAnsid();
		return result;
	}

}
