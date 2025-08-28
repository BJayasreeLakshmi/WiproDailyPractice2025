import { provideZonelessChangeDetection } from '@angular/core';
import { TestBed } from '@angular/core/testing';
import { App } from './app';

describe(("App Test"), () => {
  var component: App;

  beforeEach(() => {
    component = new App();
  });

  it("Test Case1: Check simple palindrome", () => {
    let value = component.isPalindrome("madam");
    expect(value == true).toEqual(true);
  });

  it("Test Case4: Empty string should return false", () => {
    let value = component.isPalindrome("");
    expect(value == false).toEqual(true);
  });
});
