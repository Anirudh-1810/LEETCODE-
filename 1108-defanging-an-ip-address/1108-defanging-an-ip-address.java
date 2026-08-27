class Solution {
    public String defangIPaddr(String add) {
        add=add.replace(".","[.]");
        return add;
    }
}