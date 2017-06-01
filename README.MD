## Quickstart Files:
1. pom.txt - (basic)Does not include dependencies for Test Framework
2. springconfig.xml : Spring config xml with p:namespace

## Useful Shortcuts:
1. Ctrl + shift + o => organize imports (removes unused import statements)
2. select code -> Ctrl + shift + f  => Format and Indent code
3. select member variable -> Ctrl + 1 => write getter and setters
4. right click in editor -> sources -> generate toString()
5. Ctrl + shift + / -> Comment block of code
6. Ctrl + shift + \ -> Uncomment Code 


## Program Order

#### *Basics of Dependencey Injection*
1. springcore: Dependency Setter Injection + p:namespace
2. CollectionListHospital : Dependency injection on Lists
3. CarDealerCollection : Dependency injection on Sets
4. ReferenceDemo: Dependency Injection using Reference types
5. Asst4 : First Dependency Injection Assignment

#### *Basics of Lifecycle Management*
1. Lifecycle:  Bean lifecycle management using 3 ways
	- XML configurations : init-method , destroy-method , AbstractApplicationContext , registerShutdownHook()
	- Using spring Interfaces : Implement InitializingBean,DisposableBean:: Override -> afterPropertiesSet() & destroy()
	- Enabling Annotations : @PostConstruct , @PreDestroy :: <context:annotation-config/> in xml  

2. LifecycleAsst: Practice Assignment on Bean Lifecycle management using Annotations 

#### *Dependencey check, Inner Beans and Bean Scope*
1. DependencyCheckInnerBeansAndScope : 
	- com.shrobon.spring.DependencyCheckInnerBeansAndScope : @Required annotation 
	- com.shrobon.spring.Innerbeans : Inner Beans & has a relationship
	- com.shrobon.spring.Scopes : singleton and prototype scope

#### *Constructor Injection*
1. ConstructorInjection
	- com.shrobon.spring.ConstructorInjection : Understanding basics of Constructor Injection
	- com.shrobon.spring.CInjectionAmbiguity : type, index to resolve ambiguity
	- com.shrobon.spring.beanexternalization : Bean Externalization and handling properties file

2. Autowiring
	-  autowiringConstructor: Autowiring using constructors
	-  autowiringAnnotations: using the @Autowired Annotations and @Qualifier Annotation
	