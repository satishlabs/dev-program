package com.dev.arr.test;

import com.dev.arr.FindPeakElement;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPeakElementTest {
    // Test case 1: Normal case with a peak
    @Test
    public void testFindPeakElement() {
        int[] arr = {1, 3, 20, 14, 11, 10, 21};
        int expected = 20; // Peak element
        int actual = FindPeakElement.findPeakElement(arr);
        assertEquals(expected, actual, "The peak element should be 20");
    }

    // Test case 2: Array with no peak in the middle, peak at the start
    @Test
    public void testFindPeakElementAtStart() {
        int[] arr = {10, 5, 3, 1};
        int expected = 10; // Peak element
        int actual = FindPeakElement.findPeakElement(arr);
        assertEquals(expected, actual, "The peak element should be 10 at the start");
    }

    // Test case 3: Array with no peak in the middle, peak at the end
    @Test
    public void testFindPeakElementAtEnd() {
        int[] arr = {1, 3, 5, 7, 9, 10};
        int expected = 10; // Peak element
        int actual = FindPeakElement.findPeakElement(arr);
        assertEquals(expected, actual, "The peak element should be 10 at the end");
    }

    // Test case 4: Array with only one element
    @Test
    public void testFindPeakElementSingleElement() {
        int[] arr = {42};
        int expected = 42; // Only one element, it's a peak by definition
        int actual = FindPeakElement.findPeakElement(arr);
        assertEquals(expected, actual, "The only element should be the peak");
    }

    // Test case 5: Array where the peak is at the second position
    @Test
    public void testFindPeakElementMiddle() {
        int[] arr = {1, 3, 2};
        int expected = 3; // Peak element at index 1
        int actual = FindPeakElement.findPeakElement(arr);
        assertEquals(expected, actual, "The peak element should be 3");
    }

    // Test case 6: Array with equal elements, no distinct peak
    @Test
    public void testFindPeakElementEqualElements() {
        int[] arr = {5, 5, 5, 5};
        int expected = 5; // Any element could be considered a peak since they are all equal
        int actual = FindPeakElement.findPeakElement(arr);
        assertEquals(expected, actual, "The peak element could be any of the 5's in this array");
    }
}
