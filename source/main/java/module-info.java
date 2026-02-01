module com.acromere.acorncli {

	// Compile-time only
	requires static lombok;

	// Both compile-time and run-time
	requires com.acromere.zevra;
	requires java.management;
	exports com.acromere.acorncli;

}
