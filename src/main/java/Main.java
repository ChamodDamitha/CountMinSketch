/*
* Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* WSO2 Inc. licenses this file to you under the Apache License,
* Version 2.0 (the "License"); you may not use this file except
* in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied. See the License for the
* specific language governing permissions and limitations
* under the License.
*/
public class Main {
    public static void main(String[] args) {
        CountMinSketch<Integer> countMinSketch = new CountMinSketch<Integer>(0.03, 0.99);

        countMinSketch.insert(120);
        countMinSketch.insert(120);
        countMinSketch.insert(120);

        countMinSketch.insert(550);
        countMinSketch.insert(550);

        countMinSketch.insert(300);
        countMinSketch.insert(300);
        countMinSketch.insert(300);
        countMinSketch.insert(300);
        countMinSketch.insert(300);
 
        for(int i = 0; i < 100; i++){
            countMinSketch.insert(i);
        }


        System.out.println("Count of 120 : " + countMinSketch.approximateCount(120));
        System.out.println("Count of 550 : " + countMinSketch.approximateCount(550));
        System.out.println("Count of 300 : " + countMinSketch.approximateCount(300));


        for(int i = 0; i < 100; i++){
            System.out.println("Count of " + i + " : " + countMinSketch.approximateCount(i));
        }
    }
}
