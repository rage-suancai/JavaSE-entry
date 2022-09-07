package javaSE.practice.practice5;

class ValB {
    int i;

    // 对这个示例是适用的 但这里并不是应该完整的equals()方法
    public boolean equals(Object o) {
        ValB rval = (ValB) o; // 将对象o转型为ValB
        return i == rval.i;
    }

}
