package fr.pantheonsorbonne.miage;

/**
 * an object able to be serialized as a File
 * 
 * @author nherbaut
 *
 */
public abstract class FileGenerator<T extends DiplomaGenerator> {

	protected final T generator;

	protected FileGenerator(T t) {
		this.generator = t;
	}

	public abstract void generateFile(String outputFile);
}
