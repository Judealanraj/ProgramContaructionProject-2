import java.util.*;
import java.util.HashSet;
import java.util.HashMap;
public class Tester {
    public static void main(String[] args){
        Random random = new Random();

        Integer[] integersArray = new Integer[100000];
        for(int i=0;i<100000;i++){
            int randomNumber = random.nextInt(100000);
            integersArray[i] = randomNumber;
        }


        long hashSetAddExecutionTime=0;long hashSetContainExecutionTime=0;long hashSetRemoveExecutionTime=0;long hashSetClearExecutionTime=0;
        long treeSetAddExecutionTime=0;long treeSetContainExecutionTime=0;long treeSetRemoveExecutionTime=0;long treeSetClearExecutionTime=0;
        long linkedHashSetAddExecutionTime=0;long linkedHashSetContainExecutionTime=0;long linkedHashSetRemoveExecutionTime=0;long linkedHashSetClearExecutionTime=0;
        long arrayListAddExecutionTime=0;long arrayListContainExecutionTime=0;long arrayListRemoveExecutionTime=0;long arraylistClearExecutionTime=0;
        long linkedListAddExecutionTime=0;long linkedListContainExecutionTime=0;long linkedListRemoveExecutionTime=0;long linkedListClearExecutionTime=0;
        long arrayDequeAddExecutionTime=0;long arrayDequeContainExecutionTime=0;long arrayDequeRemoveExecutionTime=0;long arrayDequeClearExecutionTime=0;
        long priorityQueueAddExecutionTime=0;long priorityQueueContainExecutionTime=0;long priorityQueueRemoveExecutionTime=0;long priorityQueueClearExecutionTime=0;
        long hashMapAddExecutionTime=0;long hashMapContainExecutionTime=0;long hashMapRemoveExecutionTime=0;long hashMapClearExecutionTime=0;
        long treeMapAddExecutionTime=0;long treeMapContainExecutionTime=0;long treeMapRemoveExecutionTime=0;long treeMapClearExecutionTime=0;
        long linkedHashMapAddExecutionTime=0;long linkedHashMapContainExecutionTime=0;long linkedHashMapRemoveExecutionTime=0;long linkedHashMapClearExecutionTime=0;



        for(int j=0;j<100;j++) {
            HashSet<Integer> hashset1 = new HashSet<Integer>(Arrays.asList(integersArray));

            long startTime1_1 = System.nanoTime();
            hashset1.add(100);
            long stopTime1_1 = System.nanoTime();
            hashSetAddExecutionTime = ((stopTime1_1 - startTime1_1) + hashSetAddExecutionTime*j)/(j+1);

            long startTime1_2 = System.nanoTime();
            hashset1.contains(100);
            long stopTime1_2 = System.nanoTime();
            hashSetContainExecutionTime = (stopTime1_2 - startTime1_2 + hashSetContainExecutionTime)/(j+1);

            long startTime1_3 = System.nanoTime();
            hashset1.remove(100);
            long stopTime1_3 = System.nanoTime();
            hashSetRemoveExecutionTime = (stopTime1_3 - startTime1_3 + hashSetRemoveExecutionTime)/(j+1);

            long startTime1_4 = System.nanoTime();
            hashset1.clear();
            long stopTime1_4 = System.nanoTime();
            hashSetClearExecutionTime = (stopTime1_4 - startTime1_4 + hashSetClearExecutionTime)/(j+1);

            TreeSet<Integer> treeSet1 = new TreeSet<Integer>(Arrays.asList(integersArray));

            long startTime2_1 = System.nanoTime();
            treeSet1.add(100);
            long stopTime2_1 = System.nanoTime();
            treeSetAddExecutionTime = (stopTime2_1 - startTime2_1 + treeSetAddExecutionTime)/(j+1);

            long startTime2_2 = System.nanoTime();
            treeSet1.contains(100);
            long stopTime2_2 = System.nanoTime();
            treeSetContainExecutionTime = (stopTime2_2 - startTime2_2 + treeSetContainExecutionTime)/(j+1);

            long startTime2_3 = System.nanoTime();
            treeSet1.remove(100);
            long stopTime2_3 = System.nanoTime();
            treeSetRemoveExecutionTime = (stopTime2_3 - startTime2_3 + treeSetRemoveExecutionTime)/(j+1);

            long startTime2_4 = System.nanoTime();
            treeSet1.clear();
            long stopTime2_4 = System.nanoTime();
            treeSetClearExecutionTime = (stopTime2_4 - startTime2_4 + treeSetClearExecutionTime)/(j+1);

            LinkedHashSet<Integer> linkedHashSet1 = new LinkedHashSet<Integer>(Arrays.asList(integersArray));

            long startTime3_1 = System.nanoTime();
            linkedHashSet1.add(100);
            long stopTime3_1 = System.nanoTime();
            linkedHashSetAddExecutionTime = (stopTime3_1 - startTime3_1 + linkedHashSetAddExecutionTime)/(j+1);

            long startTime3_2 = System.nanoTime();
            linkedHashSet1.contains(100);
            long stopTime3_2 = System.nanoTime();
            linkedHashSetContainExecutionTime = (stopTime3_2 - startTime3_2 + linkedHashSetContainExecutionTime)/(j+1);

            long startTime3_3 = System.nanoTime();
            linkedHashSet1.remove(100);
            long stopTime3_3 = System.nanoTime();
            linkedHashSetRemoveExecutionTime = (stopTime3_3 - startTime3_3 + linkedHashSetRemoveExecutionTime)/(j+1);

            long startTime3_4 = System.nanoTime();
            linkedHashSet1.clear();
            long stopTime3_4 = System.nanoTime();
            linkedHashSetClearExecutionTime = (stopTime3_4 - startTime3_4 + linkedHashSetClearExecutionTime)/(j+1);

            ArrayList<Integer> arrayList1 = new ArrayList<Integer>(Arrays.asList(integersArray));

            long startTime4_1 = System.nanoTime();
            arrayList1.add(100);
            long stopTime4_1 = System.nanoTime();
            arrayListAddExecutionTime = (stopTime4_1 - startTime4_1 + arrayListAddExecutionTime)/(j+1);

            long startTime4_2 = System.nanoTime();
            arrayList1.contains(100);
            long stopTime4_2 = System.nanoTime();
            arrayListContainExecutionTime = (stopTime4_2 - startTime4_2 + arrayListContainExecutionTime)/(j+1);

            long startTime4_3 = System.nanoTime();
            arrayList1.remove(100);
            long stopTime4_3 = System.nanoTime();
            arrayListRemoveExecutionTime = (stopTime4_3 - startTime4_3 + arrayListRemoveExecutionTime)/(j+1);

            long startTime4_4 = System.nanoTime();
            arrayList1.clear();
            long stopTime4_4 = System.nanoTime();
            arraylistClearExecutionTime = (stopTime4_4 - startTime4_4 + arraylistClearExecutionTime)/(j+1);

            LinkedList<Integer> linkedList1 = new LinkedList<Integer>(Arrays.asList(integersArray));

            long startTime5_1 = System.nanoTime();
            linkedList1.add(100);
            long stopTime5_1 = System.nanoTime();
            linkedListAddExecutionTime = (stopTime5_1 - startTime5_1 + linkedListAddExecutionTime)/(j+1);

            long startTime5_2 = System.nanoTime();
            linkedList1.contains(100);
            long stopTime5_2 = System.nanoTime();
            linkedListContainExecutionTime = (stopTime5_2 - startTime5_2 + linkedListContainExecutionTime)/(j+1);

            long startTime5_3 = System.nanoTime();
            linkedList1.remove(100);
            long stopTime5_3 = System.nanoTime();
            linkedListRemoveExecutionTime = (stopTime5_3 - startTime5_3 + linkedListRemoveExecutionTime)/(j+1);

            long startTime5_4 = System.nanoTime();
            linkedList1.clear();
            long stopTime5_4 = System.nanoTime();
            linkedListClearExecutionTime = (stopTime5_4 - startTime5_4 + linkedListClearExecutionTime)/(j+1);

            ArrayDeque<Integer> arrayDeque1 = new ArrayDeque<Integer>(Arrays.asList(integersArray));

            long startTime6_1 = System.nanoTime();
            arrayDeque1.add(100);
            long stopTime6_1 = System.nanoTime();
            arrayDequeAddExecutionTime = (stopTime6_1 - startTime6_1 + arrayDequeAddExecutionTime)/(j+1);

            long startTime6_2 = System.nanoTime();
            arrayDeque1.contains(100);
            long stopTime6_2 = System.nanoTime();
            arrayDequeContainExecutionTime = (stopTime6_2 - startTime6_2 + arrayDequeContainExecutionTime)/(j+1);

            long startTime6_3 = System.nanoTime();
            arrayDeque1.remove(100);
            long stopTime6_3 = System.nanoTime();
            arrayDequeRemoveExecutionTime = (stopTime6_3 - startTime6_3  + arrayDequeRemoveExecutionTime)/(j+1);

            long startTime6_4 = System.nanoTime();
            arrayDeque1.clear();
            long stopTime6_4 = System.nanoTime();
            arrayDequeClearExecutionTime = (stopTime6_4 - startTime6_4 + arrayDequeClearExecutionTime)/(j+1);

            PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<Integer>(Arrays.asList(integersArray));

            long startTime7_1 = System.nanoTime();
            priorityQueue1.add(100);
            long stopTime7_1 = System.nanoTime();
            priorityQueueAddExecutionTime = (stopTime7_1 - startTime7_1 + priorityQueueAddExecutionTime)/(j+1);

            long startTime7_2 = System.nanoTime();
            priorityQueue1.contains(100);
            long stopTime7_2 = System.nanoTime();
            priorityQueueContainExecutionTime = (stopTime7_2 - startTime7_2 + priorityQueueContainExecutionTime)/(j+1);

            long startTime7_3 = System.nanoTime();
            priorityQueue1.remove(100);
            long stopTime7_3 = System.nanoTime();
            priorityQueueRemoveExecutionTime = (stopTime7_3 - startTime7_3 + priorityQueueRemoveExecutionTime)/(j+1);

            long startTime7_4 = System.nanoTime();
            priorityQueue1.clear();
            long stopTime7_4 = System.nanoTime();
            priorityQueueClearExecutionTime = (stopTime7_4 - startTime7_4 + priorityQueueClearExecutionTime)/(j+1);

            HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
            for (int i = 0; i < integersArray.length; i++) {
                hashMap1.put(i, integersArray[i]);
            }

            long startTime8_1 = System.nanoTime();
            hashMap1.put(100, 100);
            long stopTime8_1 = System.nanoTime();
            hashMapAddExecutionTime = (stopTime8_1 - startTime8_1 + hashMapAddExecutionTime)/(j+1);

            long startTime8_2 = System.nanoTime();
            hashMap1.containsValue(100);
            long stopTime8_2 = System.nanoTime();
            hashMapContainExecutionTime = (stopTime8_2 - startTime8_2 + hashMapContainExecutionTime)/(j+1);

            long startTime8_3 = System.nanoTime();
            hashMap1.remove(100);
            long stopTime8_3 = System.nanoTime();
            hashMapRemoveExecutionTime = (stopTime8_3 - startTime8_3 + hashMapRemoveExecutionTime)/(j+1);

            long startTime8_4 = System.nanoTime();
            hashMap1.clear();
            long stopTime8_4 = System.nanoTime();
            hashMapClearExecutionTime = (stopTime8_4 - startTime8_4 + hashMapClearExecutionTime)/(j+1);

            TreeMap<Integer, Integer> treeMap1 = new TreeMap<Integer, Integer>();
            for (int i = 0; i < integersArray.length; i++) {
                treeMap1.put(i, integersArray[i]);
            }

            long startTime9_1 = System.nanoTime();
            treeMap1.put(100, 100);
            long stopTime9_1 = System.nanoTime();
            treeMapAddExecutionTime = (stopTime9_1 - startTime9_1 + treeMapAddExecutionTime)/(j+1);

            long startTime9_2 = System.nanoTime();
            treeMap1.containsValue(100);
            long stopTime9_2 = System.nanoTime();
            treeMapContainExecutionTime = (stopTime9_2 - startTime9_2 + treeMapContainExecutionTime)/(j+1);

            long startTime9_3 = System.nanoTime();
            treeMap1.remove(100);
            long stopTime9_3 = System.nanoTime();
            treeMapRemoveExecutionTime = (stopTime9_3 - startTime9_3 + treeMapRemoveExecutionTime)/(j+1);

            long startTime9_4 = System.nanoTime();
            treeMap1.clear();
            long stopTime9_4 = System.nanoTime();
            treeMapClearExecutionTime = (stopTime9_4 - startTime9_4 + treeMapClearExecutionTime)/(j+1);

            LinkedHashMap<Integer, Integer> linkedHashMap1 = new LinkedHashMap<Integer, Integer>();
            for (int i = 0; i < integersArray.length; i++) {
                linkedHashMap1.put(i, integersArray[i]);
            }

            long startTime10_1 = System.nanoTime();
            linkedHashMap1.put(100, 100);
            long stopTime10_1 = System.nanoTime();
            linkedHashMapAddExecutionTime = (stopTime10_1 - startTime10_1 + linkedHashMapAddExecutionTime)/(j+1);

            long startTime10_2 = System.nanoTime();
            linkedHashMap1.containsValue(100);
            long stopTime10_2 = System.nanoTime();
            linkedHashMapContainExecutionTime = (stopTime10_2 - startTime10_2 + linkedHashMapContainExecutionTime)/(j+1);

            long startTime10_3 = System.nanoTime();
            linkedHashMap1.remove(100);
            long stopTime10_3 = System.nanoTime();
            linkedHashMapRemoveExecutionTime = (stopTime10_3 - startTime10_3 + linkedHashMapRemoveExecutionTime)/(j+1);

            long startTime10_4 = System.nanoTime();
            linkedHashMap1.clear();
            long stopTime10_4 = System.nanoTime();
            linkedHashMapClearExecutionTime = (stopTime10_4 - startTime10_4 + linkedHashMapClearExecutionTime)/(j+1);
        }

        System.out.println("hashSetAddExecutionTime :"+hashSetAddExecutionTime);
        System.out.println("hashSetContainExecutionTime :"+hashSetContainExecutionTime);
        System.out.println("hashSetRemoveExecutionTime :"+hashSetRemoveExecutionTime);
        System.out.println("hashSetClearExecutionTime :"+hashSetClearExecutionTime);
        System.out.println("");

        System.out.println("treeSetAddExecutionTime :"+treeSetAddExecutionTime);
        System.out.println("treeSetContainExecutionTime :"+treeSetContainExecutionTime);
        System.out.println("treeSetRemoveExecutionTime :"+treeSetRemoveExecutionTime);
        System.out.println("treeSetClearExecutionTime :"+treeSetClearExecutionTime);
        System.out.println("");

        System.out.println("linkedHashSetAddExecutionTime :"+linkedHashSetAddExecutionTime);
        System.out.println("linkedHashSetContainExecutionTime :"+linkedHashSetContainExecutionTime);
        System.out.println("linkedHashSetRemoveExecutionTime :"+linkedHashSetRemoveExecutionTime);
        System.out.println("linkedHashSetClearExecutionTime :"+linkedHashSetClearExecutionTime);
        System.out.println("");

        System.out.println("arrayListAddExecutionTime :"+arrayListAddExecutionTime);
        System.out.println("arrayListContainExecutionTime :"+arrayListContainExecutionTime);
        System.out.println("arrayListRemoveExecutionTime :"+arrayListRemoveExecutionTime);
        System.out.println("arrayListClearExecutionTime :"+arraylistClearExecutionTime);
        System.out.println("");

        System.out.println("linkedListAddExecutionTime :"+linkedListAddExecutionTime);
        System.out.println("linkedListContainExecutionTime :"+linkedListContainExecutionTime);
        System.out.println("linkedListRemoveExecutionTime :"+linkedListRemoveExecutionTime);
        System.out.println("linkedListClearExecutionTime :"+linkedListClearExecutionTime);
        System.out.println("");

        System.out.println("arrayDequeAddExecutionTime :"+arrayDequeAddExecutionTime);
        System.out.println("arrayDequeContainExecutionTime :"+arrayDequeContainExecutionTime);
        System.out.println("arrayDequeRemoveExecutionTime :"+arrayDequeRemoveExecutionTime);
        System.out.println("arrayDequeClearExecutionTime :"+arrayDequeClearExecutionTime);
        System.out.println("");

        System.out.println("priorityQueueAddExecutionTime :"+priorityQueueAddExecutionTime);
        System.out.println("priorityQueueContainExecutionTime :"+priorityQueueContainExecutionTime);
        System.out.println("priorityQueueRemoveExecutionTime :"+priorityQueueRemoveExecutionTime);
        System.out.println("priorityQueueClearExecutionTime :"+priorityQueueClearExecutionTime);
        System.out.println("");

        System.out.println("hashMapAddExecutionTime :"+hashMapAddExecutionTime);
        System.out.println("hashMapContainExecutionTime :"+hashMapContainExecutionTime);
        System.out.println("hashMapRemoveExecutionTime :"+hashMapRemoveExecutionTime);
        System.out.println("hashMapClearExecutionTime :"+hashMapClearExecutionTime);
        System.out.println("");

        System.out.println("treeMapAddExecutionTime :"+treeMapAddExecutionTime);
        System.out.println("treeMapContainExecutionTime :"+treeMapContainExecutionTime);
        System.out.println("treeMapRemoveExecutionTime :"+treeMapRemoveExecutionTime);
        System.out.println("treeMapClearExecutionTime :"+treeMapClearExecutionTime);
        System.out.println("");

        System.out.println("linkedHashMapAddExecutionTime :"+linkedHashMapAddExecutionTime);
        System.out.println("linkedHashMapContainExecutionTime :"+linkedHashMapContainExecutionTime);
        System.out.println("linkedHashMapRemoveExecutionTime :"+linkedHashMapRemoveExecutionTime);
        System.out.println("linkedHashMapClearExecutionTime :"+linkedHashMapClearExecutionTime);
        System.out.println("");



    }
}
