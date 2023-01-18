package com.itechart.jdk9;

public class NewSyntaxSandbox {

    public void diamondOperatorExtension() {
        ExampleGenericClass<Integer> example1 = new ExampleGenericClass<>(1) {
            public void doStuff() {
                System.out.println("example1 " + getVal().intValue());
            }
        };
        example1.doStuff();

        ExampleGenericClass<? extends Integer> example2 = new ExampleGenericClass<>(1) {
            public void doStuff() {
                System.out.println("example2 " + getVal().intValue());
            }
        };
        example2.doStuff();

        ExampleGenericClass<?> example3 = new ExampleGenericClass<>(1) {
            public void doStuff() {
                System.out.println("example3 " + getVal().intValue());
            }
        };
        example3.doStuff();
    }

    public void interfaceWithPrivateMethods() {
        BaseDuplicateRemover defaultRemover = new BaseDuplicateRemover() {
            @Override
            public void calculateWrapper(Integer num) {
                calculate(num);
            }
        };

        defaultRemover.calculate(2);

        BaseDuplicateRemover modifiedRemover = new BaseDuplicateRemover() {
            @Override
            public void calculateWrapper(Integer num) {
                calculate(num / 2);
            }
        };

        modifiedRemover.calculateWrapper(2);

        BaseDuplicateRemover changedDefaultRemover = new BaseDuplicateRemover() {
            @Override
            public void calculateWrapper(Integer num) {
                calculate(num);
            }

            @Override
            public void calculate(Integer num) {
                System.out.println("Cannot use privates " + num);
            }
        };

        changedDefaultRemover.calculateWrapper(2);
    }

    private static abstract class ExampleGenericClass<T> {
        private T val;

        public ExampleGenericClass(T val) {
            this.val = val;
        }

        public T getVal() {
            return val;
        }

        public abstract void doStuff();
    }
}
