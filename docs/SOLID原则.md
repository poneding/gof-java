# SOLID 原则

SOLID 是面向对象设计中五个重要的设计原则的缩写，用来指导我们写出更易维护、扩展性更强、耦合度更低的代码。它们分别是：

## 1. **S — 单一职责原则 (Single Responsibility Principle, SRP)**

**定义**：一个类应该只有一个引起它变化的原因。
**通俗解释**：一个类只做一件事，不要既管业务逻辑又管数据存储。
**好处**：降低复杂度，方便测试和维护。

**例子**：

```java
// 违背 SRP
class Report {
    void generate() { /* 生成报告 */ }
    void print() { /* 打印报告 */ }
    void saveToDB() { /* 保存到数据库 */ }
}

// 遵守 SRP
class ReportGenerator { void generate() { /* 生成 */ } }
class ReportPrinter { void print() { /* 打印 */ } }
class ReportRepository { void saveToDB() { /* 保存 */ } }
```

## 2. **O — 开闭原则 (Open/Closed Principle, OCP)**

**定义**：对扩展开放，对修改关闭。
**通俗解释**：添加新功能时尽量通过扩展而不是修改已有代码。
**好处**：避免频繁改动老代码引入新 bug，增强系统稳定性。

**例子**（策略模式应用）：

```java
interface DiscountStrategy { double getDiscount(double price); }

class ChristmasDiscount implements DiscountStrategy {
    public double getDiscount(double price) { return price * 0.9; }
}

class NewYearDiscount implements DiscountStrategy {
    public double getDiscount(double price) { return price * 0.85; }
}

class PriceCalculator {
    DiscountStrategy strategy;
    PriceCalculator(DiscountStrategy strategy) { this.strategy = strategy; }
    double calculate(double price) { return strategy.getDiscount(price); }
}
```

添加新节日折扣时，只需增加新策略类，而不用改 `PriceCalculator`。

## 3. **L — 里氏替换原则 (Liskov Substitution Principle, LSP)**

**定义**：子类对象必须能够替换父类对象，并且程序逻辑保持正确。
**通俗解释**：子类该有的功能必须符合父类的约定，不能“坏掉”父类行为。
**好处**：确保继承关系的正确性，避免多态带来的意外错误。

**例子**：

```java
class Bird { void fly() { /* 飞 */ } }
class Sparrow extends Bird { } // ✅ 正常
class Ostrich extends Bird { void fly() { throw new RuntimeException("我不会飞"); } } // ❌ 违背 LSP
```

鸵鸟不应该继承会飞的 `Bird`，可以改为 `Bird` 抽象出 `Flyable` 接口，非飞鸟就不实现它。

## 4. **I — 接口隔离原则 (Interface Segregation Principle, ISP)**

**定义**：不应该强迫客户依赖它们不使用的方法。
**通俗解释**：接口要小而精，按需拆分，避免“大而全”接口。
**好处**：减少类实现不必要的方法，降低耦合度。

**例子**：

```java
// 违背 ISP
interface Machine {
    void print();
    void scan();
    void fax();
}

class Printer implements Machine {
    public void print() {}
    public void scan() {} // 空实现
    public void fax() {} // 空实现
}

// 遵守 ISP
interface Printer { void print(); }
interface Scanner { void scan(); }
interface Fax { void fax(); }
```

## 5. **D — 依赖倒置原则 (Dependency Inversion Principle, DIP)**

**定义**：高层模块不应该依赖低层模块，两者都应该依赖抽象。抽象不应该依赖细节，细节应该依赖抽象。
**通俗解释**：代码依赖接口或抽象类，而不是具体实现。
**好处**：减少模块间的耦合，方便替换实现。

**例子**：

```java
// 违背 DIP
class MySQLDatabase { void query(String sql) {} }
class UserService {
    private MySQLDatabase db = new MySQLDatabase(); // 直接依赖具体实现
}

// 遵守 DIP
interface Database { void query(String sql); }
class MySQLDatabase implements Database { public void query(String sql) {} }
class UserService {
    private Database db;
    UserService(Database db) { this.db = db; }
}
```

🔹 **总结口诀**：

* **S**：一个类只做一件事
* **O**：对扩展开放，对修改关闭
* **L**：子类能替父类用
* **I**：接口要小而精
* **D**：依赖抽象，不依赖细节