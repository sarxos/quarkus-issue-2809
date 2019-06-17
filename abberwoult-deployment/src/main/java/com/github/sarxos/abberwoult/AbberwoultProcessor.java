package com.github.sarxos.abberwoult;

import static io.quarkus.deployment.annotations.ExecutionTime.STATIC_INIT;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.annotations.Record;


public class AbberwoultProcessor {

	@BuildStep
	@Record(STATIC_INIT)
	public void doTest(final TestClassTemplate template) {
		template.test("com.github.sarxos.abberwoult.TestClassDependency");
		template.test("com.example.TestClassProject");
	}
}
