'use strict';

/**
 * @ngdoc overview
 * @name helloworldApp
 * @description
 * # helloworldApp
 *
 * Main module of the application.
 */
angular
  .module('helloworldApp', [
    'ngAnimate',
    'ngAria',
    'ngCookies',
    'ngMessages',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch',
    'ui.grid',
    'ui.grid.selection',
    'ui.grid.pinning'
  ])
  .config(function ($routeProvider,$locationProvider) {

    $locationProvider.hashPrefix('');

    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl',
        controllerAs: 'main'
      })
      .when('/about', {
        templateUrl: 'views/about.html',
        controller: 'AboutCtrl',
        controllerAs: 'about'
      })
      .when('/helloworld', {
        templateUrl: 'views/helloworld.html',
        controller: 'HelloworldCtrl',
        controllerAs: 'helloworld'
      })
      .when('/tables', {
        templateUrl: 'views/tables.html',
        controller: 'TablesCtrl',
        controllerAs: 'tables'
      })
      .when('/form', {
        templateUrl: 'views/formexample.html',
        controller: 'FormExampleCtrl',
        controllerAs: 'formexample'
      })
      .when('/tableDB', {
        templateUrl: 'views/tableDB.html',
        controller: 'TableDBCtrl',
        controllerAs: 'tableDB'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
